/**
 * 
 */
package flight.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Properties;
import flight.models.Email;

/**
 * @author BestTutorials
 *
 */
@Service("emailService")
public class EmailServiceImpl implements EmailService{
	@Autowired
	private JavaMailSender mailSender;

	@Async
	@Override
	public void sendEmail(Email email) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("");
        mail.setFrom(email.getAdress());
        mail.setSubject(email.getObject());
        mail.setText(email.getContent());
		mailSender.send(mail);
	}

}
