package cn.codingxiaxw.dto;

/**
 * lsk
 * 2017年10月18日16:25:57
 */
public class CommonResult {

    private String code;

    private String result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CommonResult(String code, String result) {
        this.code = code;
        this.result = result;
    }
}
