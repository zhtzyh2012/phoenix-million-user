package com.neutron.user.mng;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 属性配置文件
 * @author neutron
 */
@Data
@Component
public class PropertyMng {
    /**
     * 手机号码
     */
    @Value("${notice.mobile}")
    private Long mobile;
}
