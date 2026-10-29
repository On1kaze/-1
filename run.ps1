param (
    [int]$Task = 0
)

[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
[Console]::InputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    if (Test-Path "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.1\jbr\bin\javac.exe") {
        $env:PATH = "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.1\jbr\bin;" + $env:PATH
    } else {
        Write-Error "JDK not found in PATH!"
        exit 1
    }
}

if (-not (Test-Path "bin")) {
    New-Item -ItemType Directory -Path "bin" | Out-Null
}

Write-Host "[1/2] Compiling Java sources..." -ForegroundColor Cyan
$javaFiles = Get-ChildItem -Recurse -Filter "*.java" src | ForEach-Object { $_.FullName.Substring($PWD.Path.Length + 1).Replace('\', '/') }
$utf8NoBom = [System.Text.UTF8Encoding]::new($false)
[System.IO.File]::WriteAllLines("sources.txt", $javaFiles, $utf8NoBom)

& javac -encoding UTF-8 -d bin "@sources.txt"
if ($LASTEXITCODE -ne 0) {
    Write-Error "Compilation failed!"
    Remove-Item "sources.txt" -ErrorAction SilentlyContinue
    exit $LASTEXITCODE
}
Remove-Item "sources.txt" -ErrorAction SilentlyContinue

Write-Host "[2/2] Running Java program..." -ForegroundColor Green
Write-Host ""

if ($Task -gt 0) {
    & java "-Dfile.encoding=UTF-8" "-Dsun.stdout.encoding=UTF-8" "-Dstdout.encoding=UTF-8" -cp bin RunAllTasks $Task
} else {
    & java "-Dfile.encoding=UTF-8" "-Dsun.stdout.encoding=UTF-8" "-Dstdout.encoding=UTF-8" -cp bin RunAllTasks
}