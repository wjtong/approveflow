package com.banfftech.workeffort;

public class WorkEffort {
    private String workEffortId;
    private String workEffortName;
    private String statusId;

    public WorkEffort(String workEffortId, String workEffortName, String statusId) {
        this.workEffortId = workEffortId;
        this.workEffortName = workEffortName;
        this.statusId = statusId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getWorkEffortName() {
        return workEffortName;
    }

    public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
