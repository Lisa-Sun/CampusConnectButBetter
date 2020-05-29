package Group2.BetterCampusConnect.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule implements Serializable {
	private String monday;
	private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;


}

