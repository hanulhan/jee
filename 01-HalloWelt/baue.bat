call mvn package -Dmaven.test.skip=true
pause
copy target\01-hallowelt-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\HalloWelt.jar
