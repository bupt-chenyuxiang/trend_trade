package cn.how2j.trend.client;
 
import java.util.List;
 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.how2j.trend.pojo.IndexData;

@FeignClient(value = "INDEX-DATA-SERVICE",fallback = IndexDataClientFeignHystrix.class)
public interface IndexDataClient {
	@GetMapping("/data/{code}")
	public List<IndexData> getIndexData(@PathVariable("code") String code);
}
