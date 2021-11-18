export JBOSS_HOME=/home/uli/EW/jboss/jboss-eap-7.3/
function pause(){
   read -p "$*"
}

mvn package -Dmaven.test.skip=true
pause 'Press [Enter] key to continue...'
cp target/04-jpa-basics-1.0.0.0-SNAPSHOT.jar $JBOSS_HOME/standalone/deployments/JPA-Basics.jar
