; -- <myapp>-windows-x86.iss  --

; Demonstrates Installing NetBeans Platform Application files and creating a desktop icon.

; SEE THE DOCUMENTATION FOR DETAILS ON CREATING .ISS SCRIPT FILES!

[Setup]

AppName=<myapp name>

AppVersion=1.0

DefaultDirName={%USERPROFILE}\Applications\<mycompany>\

DefaultGroupName=<mycompany>

UninstallDisplayIcon={%USERPROFILE}\Applications\<mycompany>\<myapp>\<myapp>-unins.exe

Compression=lzma2

SolidCompression=yes

;create installer in dist directory of your Netbeans Platform Project

OutputDir=E:\asutosh\<myproject>\dist\

OutputBaseFilename=<myapp>-windows-x86

[Files]

;unzip the zipped distribution in dist directory and include all 

;files in root directory of the application.

Source: "E:\asutosh\<myproject>\dist\<myapp>\*"; DestDir: {app}; Flags: ignoreversion recursesubdirs

[Icons]

Name: "{commondesktop}\<myapp name>"; Filename: {%USERPROFILE}\Applications\<mycompany>\<myapp>\bin\<myapp>.exe

;launch application after install on client machine

[Tasks]

Name: StartAfterInstall; Description: Run application after install

;look for exe in this path on client machine

[Run]

Filename: {%USERPROFILE}\Applications\<mycompany>\<myapp>\bin\<myapp>.exe; Flags: shellexec skipifsilent nowait; Tasks: StartAfterInstall