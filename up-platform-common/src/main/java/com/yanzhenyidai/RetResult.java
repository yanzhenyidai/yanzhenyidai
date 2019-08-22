package com.yanzhenyidai;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
public class RetResult<T> implements Serializable {


    /**
     * 返回的代码
     */
    private String code;
    /**
     * 返回的数据
     */
    private T data;
    /**
     * 成功消息
     */
    private List<String> successMessages = new ArrayList<>();
    /**
     * 警告信息
     */
    private List<String> warningMessages = new ArrayList<>();
    /**
     * 错误信息
     */
    private List<String> errorMessages = new ArrayList<>();

    public static <T> RetResult<T> success(T data) {
        RetResult<T> retResult = new RetResult<>();
        retResult.code = "0";
        retResult.data = data;
        return retResult;
    }

    public static <T> RetResult<T> error(String message) {
        RetResult<T> retResult = new RetResult<>();
        retResult.code = "1";
        retResult.errorMessages.add(message);
        return retResult;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getSuccessMessages() {
        return successMessages;
    }

    public void setSuccessMessages(List<String> successMessages) {
        this.successMessages = successMessages;
    }

    public List<String> getWarningMessages() {
        return warningMessages;
    }

    public void setWarningMessages(List<String> warningMessages) {
        this.warningMessages = warningMessages;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public boolean isSuccess() {
        return errorMessages == null || errorMessages.isEmpty();
    }

    public void addSuccessMessage(String message) {
        this.successMessages.add(message);
    }

    public void addWarningMessage(String message) {
        this.warningMessages.add(message);
    }

    public void addErrorMessage(String message) {
        this.errorMessages.add(message);
    }
}
