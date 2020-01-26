package xyz.staffjoy.faraday.core.trace;

import static xyz.staffjoy.faraday.core.utils.BodyConverter.convertBodyToString;


/*
 *
 * 转发请求（映射名字、消息体）
 *
 * @Author:Zh1Cheung 945503088@qq.com
 * @Date: 20:34 2019/12/29
 *
 */
public class ForwardRequest extends IncomingRequest {

    protected String mappingName;
    protected byte[] body;

    public String getMappingName() { return mappingName; }

    protected void setMappingName(String mappingName) { this.mappingName = mappingName; }

    public String getBodyAsString() { return convertBodyToString(body); }

    public byte[] getBody() { return body; }

    protected void setBody(byte[] body) { this.body = body; }
}
