package com.github.paas.mate.cassandra.config;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CassandraConfig {

    public static final String cassandraInterface = System.getenv("CASSANDRA_INTERFACE");


}
