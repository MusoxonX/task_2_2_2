package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Device;
import uz.pdp.task_2_2_2.entity.Group;
import uz.pdp.task_2_2_2.projection.DeviceCustom;
import uz.pdp.task_2_2_2.projection.GroupCustom;

@RepositoryRestResource(path = "group",excerptProjection = GroupCustom.class)
public interface GroupRepository extends JpaRepository<Group,Integer> {
}
