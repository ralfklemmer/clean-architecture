package victor.training.clean.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import victor.training.clean.customer.entity.Customer;
import victor.training.clean.facade.dto.CustomerDto;
import victor.training.clean.customer.repo.SiteRepo;

@RequiredArgsConstructor
@Component
public class CustomerMapper {
   private final SiteRepo siteRepo;

   public Customer toEntity(CustomerDto dto) {
      Customer customer = new Customer(dto.name);
      customer.setEmail(dto.email);
      customer.setSite(siteRepo.getOne(dto.siteId));
      return customer;
   }
}