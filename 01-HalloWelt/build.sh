export JBOSS_HOME=/home/uli/EW/jboss/jboss-eap-7.3/
mvn package -Dmaven.test.skip=true
cp target/01-hallowelt-1.0.0.0-SNAPSHOT.jar $JBOSS_HOME/standalone/deployments/HalloWelt.jar
