package com.asofdate.batch.dto;

/**
 * Created by hzwy23 on 2017/6/27.
 */
public class BatchGroupDTO {
    public String suiteKey;
    public String domain_id;
    public String batch_id;
    public String group_id;

    public String getSuiteKey() {
        return suiteKey;
    }

    public void setSuiteKey(String id) {
        this.suiteKey = id;
    }

    public String getDomainId() {
        return domain_id;
    }

    public void setDomainId(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getBatchId() {
        return batch_id;
    }

    public void setBatchId(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getGroupId() {
        return group_id;
    }

    public void setGroupId(String group_id) {
        this.group_id = group_id;
    }

    @Override
    public String toString() {
        return "BatchGroupDTO{" +
                "id='" + suiteKey + '\'' +
                ", domain_id='" + domain_id + '\'' +
                ", batch_id='" + batch_id + '\'' +
                ", group_id='" + group_id + '\'' +
                '}';
    }
}
