/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.sparking.bootstrap.result;

import cn.sparking.common.exception.CommonErrorCode;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Objects;

/**
 * SpkDeviceResult.
 */
public class ShuBoDeviceResult implements Serializable {

    private static final long serialVersionUID = -2792556188993845048L;

    private Integer code;

    private String message;

    private Object data;

    /**
     * Instantiates a new spk result.
     */
    public ShuBoDeviceResult() {

    }

    /**
     * Instantiates a new spk result.
     * @param code the code
     * @param message the message
     * @param data the data
     */
    public ShuBoDeviceResult(final Integer code, final String message, final Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * return success.
     *
     * @return {@linkplain ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult success() {
        return success("");
    }

    /**
     * return success of msg.
     * @param msg the msg
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult success(final String msg) {
        return success(msg, null);
    }

    /**
     * return success.
     * @param data the data
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult success(final Object data) {
        return success(null, data);
    }

    /**
     * return success.
     * @param msg the msg
     * @param data the data
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult success(final String msg, final Object data) {
        return get(CommonErrorCode.SUCCESS, msg, data);
    }

    /**
     * return error.
     * @param msg the msg
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult error(final String msg) {
        return error(CommonErrorCode.ERROR, msg);
    }

    /**
     * return error.
     * @param code the code
     * @param msg the msg
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult error(final int code, final String msg) {
        return get(code, msg, null);
    }

    /**
     * return timeout.
     * @param msg the msg
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult timeout(final String msg) {
        return error(HttpStatus.REQUEST_TIMEOUT.value(), msg);
    }

    /**
     * return get.
     * @param code the code
     * @param msg the msg
     * @param data the data
     * @return {@link ShuBoDeviceResult}
     */
    public static ShuBoDeviceResult get(final int code, final String msg, final Object data) {
        return new ShuBoDeviceResult(code, msg, data);
    }

    /**
     * get the value of code.
     * @return the value of code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set the code.
     * @param code code
     */
    public void setCode(final Integer code) {
        this.code = code;
    }

    /**
     * get message.
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * set the message.
     * @param message message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * get data.
     * @return {@link Object}
     */
    public Object getData() {
        return data;
    }

    /**
     * set data.
     * @param data data
     */
    public void setData(final Object data) {
        this.data = data;
    }

    /**
     * toString.
     * @return Object String
     */
    @Override
    public String toString() {
        return "ShuBoDeviceResult{" + "code=" + code + ", message=" + message + '\'' + ", data=" + data + '}';
    }

    /**
     * equals.
     * @param obj object
     * @return {@linkplain boolean}
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShuBoDeviceResult)) {
            return false;
        }

        ShuBoDeviceResult that = (ShuBoDeviceResult) obj;
        return Objects.equals(code, that.code) && Objects.equals(message, that.message) && Objects.equals(data, that.data);
    }

    /**
     * hashCode.
     * @return {@linkplain int}
     */
    public int hashcode() {
        return Objects.hash(code, message, data);
    }
}
