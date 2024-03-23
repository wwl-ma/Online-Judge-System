package com.yupi.wwloj.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author 王威龙
 * @from Wang Weilong's project
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}