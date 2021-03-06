package org.nero.click.admin.dao;

import org.apache.ibatis.annotations.Param;
import org.click.admin.entity.Logo;

import java.util.List;

/**
 * Author :  root
 * Email  :  nerosoft@outlook.com
 * Date   :  16-11-5
 * Time   :  下午7:41
 */
public interface LogoDao {

    /**
     * 添加友情logo
     * @param description
     * @param hrefUrl
     * @param imgUrl
     * @return
     */
    int addLogo(@Param("description") String description,
                @Param("hrefUrl") String hrefUrl,
                @Param("imgUrl") String imgUrl);

    /**
     * 删除友情logo
     * @param id
     * @return
     */
    int delLogo(@Param("id") long id);

    /**
     * 获取友情logo
     * @return
     */
    List<Logo> getLogos();
}
