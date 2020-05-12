FROM jboss/wildfly

COPY ${PWD}/target/write.war /opt/jboss/wildfly/standalone/deployments/write.war