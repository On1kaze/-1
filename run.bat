@echo off
setlocal

:: Check javac
where javac >nul 2>nul
if %errorlevel% neq 0 (
    if exist "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.1\jbr\bin\javac.exe" (
        set "PATH=C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.1\jbr\bin;%PATH%"
    ) else (
        echo JDK was not found. Please ensure Java is installed and added to PATH.
        exit /b 1
    )
)

if not exist bin mkdir bin

powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0run.ps1" %*

endlocal
