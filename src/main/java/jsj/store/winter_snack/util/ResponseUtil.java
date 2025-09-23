package jsj.store.winter_snack.util;

import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
    public static ResponseEntity<Map<String, Object>> getResponseOk() {
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        return ResponseEntity.ok(response);
    }
}
