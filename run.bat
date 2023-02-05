set projectLocation=C:\WORKSPACE-JAVA\Automation_FrameWorks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml