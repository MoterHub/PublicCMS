package com.publiccms.entities.log;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.entity.MyColumn;

/**
 * LogTask generated by hbm2java
 */
@Entity
@Table(name = "log_task")
public class LogTask implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "站点", condition = true)
    private int siteId;
    @MyColumn(title = "任务", condition = true)
    private int taskId;
    @MyColumn(title = "开始日期", condition = true, order = true)
    private Date begintime;
    @MyColumn(title = "结束时间")
    private Date endtime;
    @MyColumn(title = "结果", condition = true)
    private boolean success;
    @MyColumn(title = "日志")
    private String result;

    public LogTask() {
    }

    public LogTask(int siteId, int taskId, Date begintime, boolean success) {
        this.siteId = siteId;
        this.taskId = taskId;
        this.begintime = begintime;
        this.success = success;
    }
    
    public LogTask(int id, int siteId, int taskId, Date begintime, Date endtime, boolean success) {
        this.id = id;
        this.siteId = siteId;
        this.taskId = taskId;
        this.begintime = begintime;
        this.endtime = endtime;
        this.success = success;
    }

    public LogTask(int siteId, int taskId, Date begintime, Date endtime, boolean success, String result) {
        this.siteId = siteId;
        this.taskId = taskId;
        this.begintime = begintime;
        this.endtime = endtime;
        this.success = success;
        this.result = result;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "task_id", nullable = false)
    public int getTaskId() {
        return this.taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "begintime", nullable = false, length = 19)
    public Date getBegintime() {
        return this.begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endtime", length = 19)
    public Date getEndtime() {
        return this.endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Column(name = "success", nullable = false)
    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Column(name = "result")
    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
