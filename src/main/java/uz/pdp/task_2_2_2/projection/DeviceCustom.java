package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Device;

@Projection(types = Device.class)
public interface DeviceCustom {
    Integer getId();
    String getName();
}
