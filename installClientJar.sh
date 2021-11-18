export JBOSS_HOME=/home/uli/EW/jboss/jboss-eap-7.3
mvn install:install-file -Dfile=$JBOSS_HOME/bin/client/jboss-client.jar -DgroupId=org.jboss -DartifactId=jboss-client -Dversion=7.3