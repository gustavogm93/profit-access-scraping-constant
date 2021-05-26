package ar.com.pa.collections.coverage;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class CoverageCountry {

	@Id
	private final String id;

	@Field(name = "title")
	@NonNull private final String title;
	
	@Field(name = "coverageMarketIndex")
	private final List<CoverageMarketIndex> coverageMarketIndex;
	
	@Field(name = "totalShares")
	@NonNull private final Integer totalShares;
	
	@Field(name = "coverage")
	@NonNull private Integer coverage;
	
	@Field(name = "lastUpdate")
	@NonNull private Date lastUpdate;
}

//QUE TODOS TENGAN PROPERTYES COMPARTIDAS
