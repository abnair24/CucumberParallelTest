package com.abn.selcucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;

/**
 * Created by aswathyn on 07/01/17.
 */
public class ExpStepDefs {

    private static String AREAOFEXPERTISE = null ;
    private WebDriver driver;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExpStepDefs.class);

    public ExpStepDefs(SharedDriver driver) {
        this.driver = driver;
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        LOGGER.info("Started in thread: " + threadId + ", in JVM: " + processName);

    }




}
