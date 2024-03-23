package com.yupi.wwloj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.wwloj.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author 王威龙
 * @from Wang Weilong's project
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




