package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Category;
import uz.pdp.task_2_2_2.entity.Device;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();
    String getName();
    Device getDevice();
}
