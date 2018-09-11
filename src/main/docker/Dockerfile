FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.6.0
COPY app.jar /{{service.code}}.jar
ENTRYPOINT exec java $JAVA_OPTS  -jar /{{service.code}}.jar