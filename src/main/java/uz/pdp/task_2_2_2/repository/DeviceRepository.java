package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Device;
import uz.pdp.task_2_2_2.projection.DeviceCustom;

@RepositoryRestResource(path = "device",excerptProjection = DeviceCustom.class)
public interface DeviceRepository extends JpaRepository<Device,Integer> {
}
