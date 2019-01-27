package org.kiwitcms.java.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestCaseRun {
    private int tcRunId;
    private int runId;
    private int caseId;
    private int build;
    //    private String logs;

    public int getTcRunId() {
        return tcRunId;
    }

    @JsonSetter("case_run_id")
    public void setTcRunId(int tcRunId) {
        this.tcRunId = tcRunId;
    }

    public int getRunId() {
        return runId;
    }

    @JsonSetter("run_id")
    public void setRunId(int runId) {
        this.runId = runId;
    }

    public int getCaseId() {
        return caseId;
    }

    @JsonSetter("case_id")
    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getBuild() {
        return build;
    }

    @JsonSetter("build_id")
    public void setBuild(int build) {
        this.build = build;
    }

}
