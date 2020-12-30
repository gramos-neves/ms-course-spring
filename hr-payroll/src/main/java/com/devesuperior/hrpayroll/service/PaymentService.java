package com.devesuperior.hrpayroll.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devesuperior.hrpayroll.entities.Payment;
import com.devesuperior.hrpayroll.entities.Worker;
import com.devesuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	// @Value("${hr-worker.host}")
	// private String workerHost;

	// @Autowired
	// private RestTemplate restTemplate;

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, Integer days) {
		// Map<String,String> uriVariables = new HashMap<>();
		// uriVariables.put("id", ""+workerId);
		// Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}",
		// Worker.class,uriVariables);

		Worker worker = workerFeignClient.findById(workerId).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
