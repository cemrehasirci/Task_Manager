package example.com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserWithTasksDto {
    private Long id;
    private String username;
    private List<Long> taskIds;
    private boolean maxLimitReached;
}
