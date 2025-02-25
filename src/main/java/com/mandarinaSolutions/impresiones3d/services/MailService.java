package com.mandarinaSolutions.impresiones3d.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mandarinaSolutions.impresiones3d.DTO.MailDTO;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(MailDTO request) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mandarinasolutionstaff@gmail.com");
		message.setTo(request.getTo());
		message.setSubject("Confirmación de pedido - Impresiones 3D");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Gracias por elejirnos, tus productos seleccionados fueron: \n\n");
		
		for(var item : request.getCartItems()) {
			sb.append("Producto: ").append(item.getTitulo()).append("\n")
			.append("Cantidad: ").append(item.getCantidad()).append("\n")
			.append("Color: ").append(item.getColor()).append("\n")
			.append("Dimensiones: ").append(item.getDimension_mm()).append("\n")
			.append("Precio unitario: ").append(item.getPrecio_lista()).append("\n\n");
		}
		
		sb.append("Total: ").append(request.getTotal()).append("\n\n");
		sb.append("Para confirmar tu pedido, transfiere el total al siguiente alias: Diego el piola\n");
		
		message.setText(sb.toString());
		mailSender.send(message);
		
		
	}

}
