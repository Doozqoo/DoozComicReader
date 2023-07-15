package com.dooz.enums;

/**
 * @author Ayachi Nene
 */
public enum HttpStatus {
    CONTINUE(100, "继续"),
    SWITCHING_PROTOCOLS(101, "切换协议"),
    PROCESSING(102, "处理中"),
    OK(200, "成功"),
    CREATED(201, "已创建"),
    ACCEPTED(202, "已接受"),
    NON_AUTHORITATIVE_INFORMATION(203, "非权威信息"),
    NO_CONTENT(204, "无内容"),
    RESET_CONTENT(205, "重置内容"),
    PARTIAL_CONTENT(206, "部分内容"),
    MULTI_STATUS(207, "多状态"),
    ALREADY_REPORTED(208, "已报告"),
    IM_USED(226, "IM已使用"),
    MULTIPLE_CHOICES(300, "多种选择"),
    MOVED_PERMANENTLY(301, "永久移动"),
    FOUND(302, "找到"),
    SEE_OTHER(303, "参见其他信息"),
    NOT_MODIFIED(304, "未修改"),
    USE_PROXY(305, "使用代理服务器"),
    TEMPORARY_REDIRECT(307, "临时重定向"),
    PERMANENT_REDIRECT(308, "永久重定向"),
    BAD_REQUEST(400, "错误请求"),
    UNAUTHORIZED(401, "未授权"),
    PAYMENT_REQUIRED(402, "需要付款"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "未找到资源"),
    METHOD_NOT_ALLOWED(405, "不支持的请求方法"),
    NOT_ACCEPTABLE(406, "不接受请求参数格式"),
    PROXY_AUTHENTICATION_REQUIRED(407, "需要代理服务器身份验证"),
    REQUEST_TIMEOUT(408, "请求超时"),
    CONFLICT(409,"请求冲突，服务器端已经存在该资源了，不能再次创建或者修改资源了"),
    GONE(410,"该资源已经不存在"),
    LENGTH_REQUIRED (411,"需要请求头:Content-Length"),
    PRECONDITION_FAILED (412,"请求头中指定的一些前提条件失败"),
    PAYLOAD_TOO_LARGE (413,"请求体过大，超出了服务器的处理能力"),
    URI_TOO_LONG (414,"URI过长，超出了服务器的处理能力"),
    UNSUPPORTED_MEDIA_TYPE (415,"不支持的媒体类型"),
    REQUESTED_RANGE_NOT_SATISFIABLE (416,"请求范围不合法"),
    EXPECTATION_FAILED (417,"Expect请求头中指定的一些预期条件失败"),
    I_AM_A_TEAPOT (418,"我是一个茶壶"),
    MISDIRECTED_REQUEST (421,"该请求针对的是无法产生响应的服务器"),
    UNPROCESSABLE_ENTITY (422,"请求格式正确，但是由于含有语义错误，无法响应"),
    LOCKED (423,"当前资源被锁定"),
    FAILED_DEPENDENCY (424,"由于之前的某个请求发生的错误，导致当前请求失败"),
    TOO_EARLY (425,"当前时间未到资源可用时间"),
    UPGRADE_REQUIRED (426,"客户端应当切换到TLS/1.0"),
    PRECONDITION_REQUIRED (428,"原始服务器要求客户端满足条件才能执行此请求"),
    TOO_MANY_REQUESTS (429,"用户在给定的时间内发送了太多的请求"),
    REQUEST_HEADER_FIELDS_TOO_LARGE (431,"服务器不愿意处理该请求，因为它的请求头字段太大"),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "因法律原因不可用"),
    INTERNAL_SERVER_ERROR(500, "内部服务器错误"),
    NOT_IMPLEMENTED(501, "未实现"),
    BAD_GATEWAY(502, "错误网关"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),
    GATEWAY_TIMEOUT(504, "网关超时"),
    HTTP_VERSION_NOT_SUPPORTED(505, "不支持的HTTP版本"),
    VARIANT_ALSO_NEGOTIATES(506, "数据需要审核"),
    INSUFFICIENT_STORAGE(507, "存储空间不足"),
    LOOP_DETECTED(508, "检测到循环"),
    BANDWIDTH_LIMIT_EXCEEDED(509, "超出带宽限制"),
    NOT_EXTENDED(510, "未扩展"),
    NETWORK_AUTHENTICATION_REQUIRED(511, "需要网络验证");

    private final int value;
    private final String reasonPhrase;

    HttpStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String reasonPhrase() {
        return this.reasonPhrase;
    }
}
