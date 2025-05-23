/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.app.common;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.time.Duration;
import java.util.regex.Pattern;

public final class Constants {

    private Constants() {
        throw new UnsupportedOperationException("Construct Constants");
    }

    /** common properties path */
    public static final String COMMON_PROPERTIES_PATH = "/common.properties";

    public static final String FORMAT_SS = "%s%s";
    public static final String FORMAT_S_S = "%s/%s";
    public static final String FORMAT_S_S_COLON = "%s:%s";
    public static final String AWS_ACCESS_KEY_ID = "aws.access.key.id";
    public static final String AWS_SECRET_ACCESS_KEY = "aws.secret.access.key";
    public static final String AWS_REGION = "aws.region";
    public static final String FOLDER_SEPARATOR = "/";

    public static final String FOLDER_DOLLOR = "$";

    public static final String RESOURCE_TYPE_FILE = "resources";

    public static final String RESOURCE_TYPE_UDF = "udfs";

    public static final String STORAGE_S3 = "S3";

    public static final String STORAGE_HDFS = "HDFS";

    public static final String EMPTY_STRING = "";

    /** fs.defaultFS */
    public static final String FS_DEFAULT_FS = "fs.defaultFS";

    /** hadoop configuration */
    public static final String HADOOP_RM_STATE_ACTIVE = "ACTIVE";

    public static final String HADOOP_RESOURCE_MANAGER_HTTPADDRESS_PORT =
            "resource.manager.httpaddress.port";

    /** yarn.resourcemanager.ha.rm.ids */
    public static final String YARN_RESOURCEMANAGER_HA_RM_IDS = "yarn.resourcemanager.ha.rm.ids";

    /** yarn.application.status.address */
    public static final String YARN_APPLICATION_STATUS_ADDRESS = "yarn.application.status.address";

    /** yarn.job.history.status.address */
    public static final String YARN_JOB_HISTORY_STATUS_ADDRESS = "yarn.job.history.status.address";

    /** hdfs configuration hdfs.root.user */
    public static final String HDFS_ROOT_USER = "hdfs.root.user";

    /** hdfs/s3 configuration resource.upload.path */
    public static final String RESOURCE_UPLOAD_PATH = "resource.upload.path";

    /** data basedir path */
    public static final String DATA_BASEDIR_PATH = "data.basedir.path";

    /** dolphinscheduler.env.path */
    public static final String DOLPHINSCHEDULER_ENV_PATH = "dolphinscheduler.env.path";

    /** environment properties default path */
    public static final String ENV_PATH = "dolphinscheduler_env.sh";

    /** resource.view.suffixs */
    public static final String RESOURCE_VIEW_SUFFIXES = "resource.view.suffixs";

    public static final String RESOURCE_VIEW_SUFFIXES_DEFAULT_VALUE =
            "txt,log,sh,bat,conf,cfg,py,java,sql,xml,hql,properties,json,yml,yaml,ini,js";

    /** development.state */
    public static final String DEVELOPMENT_STATE = "development.state";

    /** sudo enable */
    public static final String SUDO_ENABLE = "sudo.enable";

    public static final String SET_TENANT_OWNER_ENABLE = "setTenantOwner.enable";

    /** string true */
    public static final String STRING_TRUE = "true";

    /** resource storage type */
    public static final String RESOURCE_STORAGE_TYPE = "resource.storage.type";

    public static final String AWS_END_POINT = "aws.endpoint";
    /** comma , */
    public static final String COMMA = ",";

    /** COLON : */
    public static final String COLON = ":";

    /** period . */
    public static final String PERIOD = ".";

    /** QUESTION ? */
    public static final String QUESTION = "?";

    /** SPACE " " */
    public static final String SPACE = " ";

    /** SINGLE_SLASH / */
    public static final String SINGLE_SLASH = "/";

    /** DOUBLE_SLASH // */
    public static final String DOUBLE_SLASH = "//";

    /** EQUAL SIGN */
    public static final String EQUAL_SIGN = "=";

    /** AT SIGN */
    public static final String AT_SIGN = "@";

    /** date format of yyyy-MM-dd HH:mm:ss */
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /** date format of yyyyMMdd */
    public static final String YYYYMMDD = "yyyyMMdd";

    /** date format of yyyyMMddHHmmss */
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /** date format of yyyyMMddHHmmssSSS */
    public static final String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    /** http connect time out */
    public static final int HTTP_CONNECT_TIMEOUT = 60 * 1000;

    /** http connect request time out */
    public static final int HTTP_CONNECTION_REQUEST_TIMEOUT = 60 * 1000;

    /** httpclient soceket time out */
    public static final int SOCKET_TIMEOUT = 60 * 1000;

    /** registry session timeout */
    public static final int REGISTRY_SESSION_TIMEOUT = 10 * 1000;

    /** http header */
    public static final String HTTP_HEADER_UNKNOWN = "unKnown";

    /** http X-Forwarded-For */
    public static final String HTTP_X_FORWARDED_FOR = "X-Forwarded-For";

    /** http X-Real-IP */
    public static final String HTTP_X_REAL_IP = "X-Real-IP";

    /** UTF-8 */
    public static final String UTF_8 = "UTF-8";

    /** user name regex */
    public static final Pattern REGEX_USER_NAME = Pattern.compile("^[a-zA-Z0-9._-]{3,39}$");

    /** read permission */
    public static final int READ_PERMISSION = 2;

    /** write permission */
    public static final int WRITE_PERMISSION = 2 * 2;

    /** execute permission */
    public static final int EXECUTE_PERMISSION = 1;

    /** default admin permission */
    public static final int DEFAULT_ADMIN_PERMISSION = 7;

    /** default hash map size */
    public static final int DEFAULT_HASH_MAP_SIZE = 16;

    /** all permissions */
    public static final int ALL_PERMISSIONS =
            READ_PERMISSION | WRITE_PERMISSION | EXECUTE_PERMISSION;

    /** max task timeout */
    public static final int MAX_TASK_TIMEOUT = 24 * 3600;

    /** worker host weight */
    public static final int DEFAULT_WORKER_HOST_WEIGHT = 100;

    /** time unit secong to minutes */
    public static final int SEC_2_MINUTES_TIME_UNIT = 60;

    /**
     * *
     *
     * <p>rpc port
     */
    public static final String RPC_PORT = "rpc.port";

    /** forbid running task */
    public static final String FLOWNODE_RUN_FLAG_FORBIDDEN = "FORBIDDEN";

    /** normal running task */
    public static final String FLOWNODE_RUN_FLAG_NORMAL = "NORMAL";

    public static final String COMMON_TASK_TYPE = "common";

    public static final String DEFAULT = "default";
    public static final String ENCRYPTION_TYPE_NONE = "none";
    public static final String PASSWORD = "password";
    public static final String XXXXXX = "******";
    public static final String NULL = "NULL";
    public static final String THREAD_NAME_MASTER_SERVER = "Master-Server";
    public static final String THREAD_NAME_WORKER_SERVER = "Worker-Server";
    public static final String THREAD_NAME_ALERT_SERVER = "Alert-Server";

    /** command parameter keys */
    public static final String CMD_PARAM_RECOVER_PROCESS_ID_STRING = "ProcessInstanceId";

    public static final String CMD_PARAM_RECOVERY_START_NODE_STRING = "StartNodeIdList";

    public static final String CMD_PARAM_RECOVERY_WAITING_THREAD = "WaitingThreadInstanceId";

    public static final String CMD_PARAM_SUB_PROCESS = "processInstanceId";

    public static final String CMD_PARAM_EMPTY_SUB_PROCESS = "0";

    public static final String CMD_PARAM_SUB_PROCESS_PARENT_INSTANCE_ID = "parentProcessInstanceId";

    public static final String CMD_PARAM_SUB_PROCESS_DEFINE_CODE = "processDefinitionCode";

    public static final String CMD_PARAM_START_NODES = "StartNodeList";

    public static final String CMD_PARAM_CLEAN_STATE_TASK_INSTANCE_IDS =
            "CleanStateTaskInstanceIds";

    public static final String CMD_PARAM_DEPENDENT_TASK_TRACK_DATA = "dependentTaskTrackData";

    public static final String CMD_PARAM_SUBPROCESS_TASK_TRACK_DATA = "subProcessTaskTrackData";

    public static final String CMD_PARAM_RECOVERY_PAUSED_ISOLATED_TASK_IDS =
            "RecoveryPausedIsolationTaskInstanceIds";
    public static final String CMD_PARAM_RECOVERY_KILLED_ISOLATED_TASK_IDS =
            "RecoveryKilledIsolationTaskInstanceIds";

    public static final String CMD_PARAM_RECOVERY_PAUSED_BY_CORONATION_TASK_IDS =
            "RecoveryPausedByCoronationTaskInstanceIds";

    public static final String CMD_PARAM_START_PARAMS = "StartParams";

    public static final String CMD_PARAM_FATHER_PARAMS = "fatherParams";

    /** complement data start date */
    public static final String CMDPARAM_COMPLEMENT_DATA_START_DATE = "complementStartDate";

    /** complement data end date */
    public static final String CMDPARAM_COMPLEMENT_DATA_END_DATE = "complementEndDate";

    /** complement data Schedule date */
    public static final String CMDPARAM_COMPLEMENT_DATA_SCHEDULE_DATE_LIST =
            "complementScheduleDateList";

    public static final String CMDPARAM_COMPLEMENT_DATA_CALENDAR_TYPE = "complementCalendarType";

    public static final String CMDPARAM_COMPLEMENT_DATA_CALENDAR_CODE = "complementCalendarCode";

    /** complement date default cron string */
    public static final String DEFAULT_CRON_STRING = "0 0 0 * * ? *";

    /** sleep 1000ms */
    public static final long SLEEP_TIME_MILLIS = 1_000L;

    /** short sleep 100ms */
    public static final long SLEEP_TIME_MILLIS_SHORT = 100L;

    public static final Duration SERVER_CLOSE_WAIT_TIME = Duration.ofSeconds(3);

    /** one second mils */
    public static final long SECOND_TIME_MILLIS = 1_000L;

    /** master task instance cache-database refresh interval */
    public static final long CACHE_REFRESH_TIME_MILLIS = 20 * 1_000L;

    /** heartbeat for zk info length */
    public static final int HEARTBEAT_FOR_ZOOKEEPER_INFO_LENGTH = 13;

    /** jar */
    public static final String JAR = "jar";

    /** hadoop */
    public static final String HADOOP = "hadoop";

    /** -D <property>=<value> */
    public static final String D = "-D";

    /** exit code success */
    public static final int EXIT_CODE_SUCCESS = 0;

    /** exit code failure */
    public static final int EXIT_CODE_FAILURE = -1;

    /** process or task definition failure */
    public static final int DEFINITION_FAILURE = -1;

    public static final int OPPOSITE_VALUE = -1;

    /** process or task definition first version */
    public static final int VERSION_FIRST = 1;

    /** date format of yyyyMMdd */
    public static final String PARAMETER_FORMAT_DATE = "yyyyMMdd";

    /** date format of yyyyMMddHHmmss */
    public static final String PARAMETER_FORMAT_TIME = "yyyyMMddHHmmss";

    /** system date(yyyyMMddHHmmss) */
    public static final String PARAMETER_DATETIME = "system.datetime";

    /** system date(yyyymmdd) today */
    public static final String PARAMETER_CURRENT_DATE = "system.biz.curdate";

    /** system date(yyyymmdd) yesterday */
    public static final String PARAMETER_BUSINESS_DATE = "system.biz.date";

    public static final String TASK_TYPE_CONDITIONS = "CONDITIONS";

    public static final String TASK_TYPE_SWITCH = "SWITCH";

    public static final String TASK_TYPE_SUB_PROCESS = "SUB_PROCESS";

    public static final String TASK_TYPE_DEPENDENT = "DEPENDENT";

    public static final String TASK_TYPE_BLOCKING = "BLOCKING";

    public static final String TASK_TYPE_STREAM = "STREAM";

    /** ACCEPTED */
    public static final String ACCEPTED = "ACCEPTED";

    /** SUCCEEDED */
    public static final String SUCCEEDED = "SUCCEEDED";
    /** ENDED */
    public static final String ENDED = "ENDED";
    /** NEW */
    public static final String NEW = "NEW";
    /** NEW_SAVING */
    public static final String NEW_SAVING = "NEW_SAVING";
    /** SUBMITTED */
    public static final String SUBMITTED = "SUBMITTED";
    /** FAILED */
    public static final String FAILED = "FAILED";
    /** KILLED */
    public static final String KILLED = "KILLED";
    /** RUNNING */
    public static final String RUNNING = "RUNNING";
    /** underline "_" */
    public static final String UNDERLINE = "_";
    /** application regex */
    public static final String APPLICATION_REGEX = "application_\\d+_\\d+";

    public static final String PID = SystemUtils.IS_OS_WINDOWS ? "handle" : "pid";
    /** month_begin */
    public static final String MONTH_BEGIN = "month_begin";
    /** add_months */
    public static final String ADD_MONTHS = "add_months";
    /** month_end */
    public static final String MONTH_END = "month_end";
    /** week_begin */
    public static final String WEEK_BEGIN = "week_begin";
    /** week_end */
    public static final String WEEK_END = "week_end";
    /** timestamp */
    public static final String TIMESTAMP = "timestamp";

    public static final char SUBTRACT_CHAR = '-';
    public static final char ADD_CHAR = '+';
    public static final char MULTIPLY_CHAR = '*';
    public static final char DIVISION_CHAR = '/';
    public static final char LEFT_BRACE_CHAR = '(';
    public static final char RIGHT_BRACE_CHAR = ')';
    public static final String ADD_STRING = "+";
    public static final String STAR = "*";
    public static final String DIVISION_STRING = "/";
    public static final String LEFT_BRACE_STRING = "(";
    public static final char P = 'P';
    public static final char N = 'N';
    public static final String SUBTRACT_STRING = "-";
    public static final String GLOBAL_PARAMS = "globalParams";
    public static final String LOCAL_PARAMS = "localParams";
    public static final String SUBPROCESS_INSTANCE_ID = "subProcessInstanceId";
    public static final String PROCESS_INSTANCE_STATE = "processInstanceState";
    public static final String PARENT_WORKFLOW_INSTANCE = "parentWorkflowInstance";
    public static final String CONDITION_RESULT = "conditionResult";
    public static final String SWITCH_RESULT = "switchResult";
    public static final String WAIT_START_TIMEOUT = "waitStartTimeout";
    public static final String DEPENDENCE = "dependence";
    public static final String TASK_LIST = "taskList";
    public static final String QUEUE = "queue";
    public static final String QUEUE_NAME = "queueName";
    public static final int LOG_QUERY_SKIP_LINE_NUMBER = 0;
    public static final int LOG_QUERY_LIMIT = 4096;
    public static final String OTHER_PARAMS = "otherParams";
    public static final String DEPEND_STRATEGY = "dependStrategy";
    public static final String BLOCKING_CONDITION = "blockingCondition";
    public static final String ALERT_WHEN_BLOCKING = "alertWhenBlocking";

    /** master/worker server use for zk */
    public static final String MASTER_TYPE = "master";

    public static final String WORKER_TYPE = "worker";
    public static final String DELETE_OP = "delete";
    public static final String ADD_OP = "add";
    public static final String ALIAS = "alias";
    public static final String CONTENT = "content";

    public static final String PATH = "path";
    public static final String DEPENDENT_SPLIT = ":||";
    public static final long DEPENDENT_ALL_TASK_CODE = 0;

    /** preview schedule execute count */
    public static final int PREVIEW_SCHEDULE_EXECUTE_COUNT = 5;

    /** kerberos */
    public static final String KERBEROS = "kerberos";

    /** kerberos expire time */
    public static final String KERBEROS_EXPIRE_TIME = "kerberos.expire.time";

    /** java.security.krb5.conf */
    public static final String JAVA_SECURITY_KRB5_CONF = "java.security.krb5.conf";

    /** java.security.krb5.conf.path */
    public static final String JAVA_SECURITY_KRB5_CONF_PATH = "java.security.krb5.conf.path";

    /** hadoop.security.authentication */
    public static final String HADOOP_SECURITY_AUTHENTICATION = "hadoop.security.authentication";

    /** hadoop.security.authentication */
    public static final String HADOOP_SECURITY_AUTHENTICATION_STARTUP_STATE =
            "hadoop.security.authentication.startup.state";

    /** com.amazonaws.services.s3.enableV4 */
    public static final String AWS_S3_V4 = "com.amazonaws.services.s3.enableV4";

    /** loginUserFromKeytab user */
    public static final String LOGIN_USER_KEY_TAB_USERNAME = "login.user.keytab.username";

    /** loginUserFromKeytab path */
    public static final String LOGIN_USER_KEY_TAB_PATH = "login.user.keytab.path";

    public static final String WORKFLOW_INSTANCE_ID_MDC_KEY = "workflowInstanceId";
    public static final String TASK_INSTANCE_ID_MDC_KEY = "taskInstanceId";

    /** task log info format */
    public static final String TASK_LOG_INFO_FORMAT = "TaskLogInfo-%s";

    /** status */
    public static final String STATUS = "status";

    /** message */
    public static final String MSG = "msg";

    /** data total */
    public static final String COUNT = "count";

    /** page size */
    public static final String PAGE_SIZE = "pageSize";

    /** current page no */
    public static final String PAGE_NUMBER = "pageNo";

    /** */
    public static final String DATA_LIST = "data";

    public static final String TOTAL_LIST = "totalList";

    public static final String CURRENT_PAGE = "currentPage";

    public static final String TOTAL_PAGE = "totalPage";

    public static final String TOTAL = "total";

    /** workflow */
    public static final String WORKFLOW_LIST = "workFlowList";

    public static final String WORKFLOW_RELATION_LIST = "workFlowRelationList";

    /** session user */
    public static final String SESSION_USER = "session.user";

    public static final String SESSION_ID = "sessionId";

    /** Security authentication types (supported types: PASSWORD,LDAP) */
    public static final String SECURITY_CONFIG_TYPE = "securityConfigType";

    /** locale */
    public static final String LOCALE_LANGUAGE = "language";

    /** database type */
    public static final String MYSQL = "MYSQL";

    public static final String HIVE = "HIVE";

    public static final String ADDRESS = "address";
    public static final String DATABASE = "database";
    public static final String OTHER = "other";
    public static final String USER = "user";
    public static final String JDBC_URL = "jdbcUrl";

    /** session timeout */
    public static final int SESSION_TIME_OUT = 7200;

    public static final int MAX_FILE_SIZE = 1024 * 1024 * 1024;
    public static final String UDF = "UDF";
    public static final String CLASS = "class";

    /** dataSource sensitive param */
    public static final String DATASOURCE_PASSWORD_REGEX =
            "(?<=((?i)password((\":\")|(=')))).*?(?=((\")|(')))";

    /** default worker group */
    public static final String DEFAULT_WORKER_GROUP = "default";
    /** authorize writable perm */
    public static final int AUTHORIZE_WRITABLE_PERM = 7;
    /** authorize readable perm */
    public static final int AUTHORIZE_READABLE_PERM = 4;

    public static final int NORMAL_NODE_STATUS = 0;
    public static final int ABNORMAL_NODE_STATUS = 1;
    public static final int BUSY_NODE_STATUE = 2;

    public static final String START_TIME = "start time";
    public static final String END_TIME = "end time";
    public static final String START_END_DATE = "startDate,endDate";

    /** system line separator */
    public static final String SYSTEM_LINE_SEPARATOR = System.getProperty("line.separator");

    /** datasource encryption salt */
    public static final String DATASOURCE_ENCRYPTION_SALT_DEFAULT = "!@#$%^&*";

    public static final String DATASOURCE_ENCRYPTION_ENABLE = "datasource.encryption.enable";
    public static final String DATASOURCE_ENCRYPTION_SALT = "datasource.encryption.salt";

    /** network interface preferred */
    public static final String DOLPHIN_SCHEDULER_NETWORK_INTERFACE_PREFERRED =
            "dolphin.scheduler.network.interface.preferred";

    /** network IP gets priority, default inner outer */
    public static final String DOLPHIN_SCHEDULER_NETWORK_PRIORITY_STRATEGY =
            "dolphin.scheduler.network.priority.strategy";

    /** exec shell scripts */
    public static final String SH = "sh";

    /** pstree, get pud and sub pid */
    public static final String PSTREE = "pstree";

    public static final boolean KUBERNETES_MODE =
            !StringUtils.isEmpty(System.getenv("KUBERNETES_SERVICE_HOST"))
                    && !StringUtils.isEmpty(System.getenv("KUBERNETES_SERVICE_PORT"));

    /** dry run flag */
    public static final int DRY_RUN_FLAG_NO = 0;

    public static final int DRY_RUN_FLAG_YES = 1;

    /** data.quality.error.output.path */
    public static final String DATA_QUALITY_ERROR_OUTPUT_PATH = "data-quality.error.output.path";

    public static final String CACHE_KEY_VALUE_ALL = "'all'";

    /** use for k8s */
    public static final String NAMESPACE = "namespace";

    public static final String K8S = "k8s";
    public static final String LIMITS_CPU = "limitsCpu";
    public static final String LIMITS_MEMORY = "limitsMemory";

    public static final String K8S_LOCAL_TEST_CLUSTER = "ds_null_k8s";

    /** schedule timezone */
    public static final String SCHEDULE_TIMEZONE = "schedule_timezone";

    public static final int RESOURCE_FULL_NAME_MAX_LENGTH = 128;

    /** tenant */
    public static final int TENANT_FULL_NAME_MAX_LENGTH = 30;

    /** schedule time the amount of date data is too large, affecting the memory, so set 100 */
    public static final int SCHEDULE_TIME_MAX_LENGTH = 100;

    /** password max and min LENGTH */
    public static final int USER_PASSWORD_MAX_LENGTH = 20;

    public static final int USER_PASSWORD_MIN_LENGTH = 2;

    public static final String FUNCTION_START_WITH = "$";

    public static final Integer DEFAULT_QUEUE_ID = 1;

    public static final Integer DEFAULT_MAX_RETRY_COUNT = 100;

    public static final String TASK_PRIORITY_QUEUE = "TASK_PRIORITY_QUEUE";

    public static final String TASK_DISPATCH_FAILED_QUEUE = "TASK_DISPATCH_FAILED_QUEUE";

    public static final String TASK_PARSE_RUNNING_LOG_QUEUE = "TASK_PARSE_RUNNING_LOG_QUEUE";

    public static final int DESC_LENGTH_GO_ONLINE = 255;

    public static final int NAME_LENGTH_GO_ONLINE = 100;

    /** Task Types */
    public static final String TYPE_UNIVERSAL = "Universal";

    public static final String TYPE_DATA_INTEGRATION = "DataIntegration";
    public static final String TYPE_CLOUD = "Cloud";
    public static final String TYPE_LOGIC = "Logic";
    public static final String TYPE_DATA_QUALITY = "DataQuality";
    public static final String TYPE_OTHER = "Other";
    public static final String TYPE_MACHINE_LEARNING = "MachineLearning";

    /** file upload verify */
    public static final String FILE_TYPE_RESTRICTED_LIST = "file.type.restricted.list";

    public static final String FILE_NAME_RESTRICTED_CONTENT = "file.name.restricted.content";

    /** need parse running log task types */
    public static final String NEED_PARSE_RUNNING_LOG_TASK_TYPES =
            "need.parse.running.log.task.types";

    public static final String GIT_RESOURCE_BASE_DIR = "git.resource.base.dir";

    public static final String GIT_RESOURCE_FILTER = "git.resource.filter";

    public static final String FILE_TYPE_SUPPORT_LIST = "file.type.support.list";

    public static final String SYSTEM_INTERNAL_PERMISSION_FILTER =
            "system.internal.permission.filter";

    public static final String WS_SUPPORT_DATASOURCES = "ws.support.datasources";

    public static final String SEATUNNEL_TRANSFORMS_JAR_PATH = "seatunnel.transforms.jar.path";

    /** default alert group id */
    public static final int DEFAULT_ALERT_GROUP_ID = 1;

    public static final String TASK_ID = "taskId";

    public static final String AUTHENTICATION_PROVIDER_LDAP = "LDAP";
    public static final String AUTHENTICATION_PROVIDER_DB = "DB";
    public static final String ENCRYPTION_IDENTIFIER_KEY = "shade.identifier";
}
