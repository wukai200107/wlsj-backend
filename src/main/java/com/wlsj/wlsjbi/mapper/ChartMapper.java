package com.wlsj.wlsjbi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wlsj.wlsjbi.model.entity.Chart;

import java.util.List;
import java.util.Map;

/**
* @author wlsj
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-05-14 19:20:33
* @Entity com.wlsj.wlsjbi.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    /**
     * @param querySql
     * @return
     */
    List<Map<String, Object>> queryChartData(String querySql);
}




