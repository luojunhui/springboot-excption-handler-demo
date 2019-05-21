package cn.junhui.demo.handler;


import cn.junhui.demo.vo.ResultVO;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.util.ContentCachingRequestWrapper;

import java.io.IOException;
import java.util.Map;

/**
 * ExceptionHandler class
 *
 * @author junhui
 * @date 19-4-26
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ResultVO> exception(ContentCachingRequestWrapper request, Exception e) throws IOException {
        System.out.println("拦截到异常...");
        System.out.println("请求地址:" + request.getRequestURL());
        System.out.println("请求方式:" + request.getMethod());
        Map<String, String[]> param = request.getParameterMap();
        param.forEach((key, value) -> System.out.printf("%s:%s\n", key,value[0]));
        byte[] data = request.getContentAsByteArray();
        if (data.length > 0) {
            String body = new String(data);
            System.out.println("请求参数:" + body);
        }
        String fullStackTrace = ExceptionUtils.getFullStackTrace(e);
        System.out.println("堆栈信息:" + fullStackTrace);
        return new ResponseEntity<ResultVO>(new ResultVO("1111", "异常" + e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
