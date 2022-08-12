package com.github.paas.mate.cassandra.constant;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class PathConst {

    public static final String CASSANDRA_HOME = "/opt/sh/cassandra";

    public static final String CASSANDRA_CONFIG_DIR = CASSANDRA_HOME + File.separator + "conf";

    public static final String CASSANDRA_ORIGINAL_CONFIG = CASSANDRA_CONFIG_DIR + File.separator + "cassandra-original.yaml";

    public static final String CASSANDRA_CONFIG = CASSANDRA_CONFIG_DIR + File.separator + "cassandra.yaml";

}
