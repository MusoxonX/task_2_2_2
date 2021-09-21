package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Category;
import uz.pdp.task_2_2_2.entity.Group;

@Projection(types = Group.class)
public interface GroupCustom {
    Integer getId();
    String getName();
    Integer getAmount();
    Category getCategory();
}
