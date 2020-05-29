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
	private List<String> monday;
	private List<String> tuesday;
    private List<String> wednesday;
    private List<String> thursday;
    private List<String> friday;


}

