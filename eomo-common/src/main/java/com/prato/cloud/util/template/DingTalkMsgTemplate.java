package com.prato.cloud.util.template;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 钉钉消息模板
 */
@Data
@ToString
public class DingTalkMsgTemplate implements Serializable {
    private String msgType;
    private TextBean text;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public TextBean getText() {
        return text;
    }

    public void setText(TextBean text) {
        this.text = text;
    }

    public static class TextBean {
        /**
         * content : 服务: pig-upms-service 状态：UP
         */
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
