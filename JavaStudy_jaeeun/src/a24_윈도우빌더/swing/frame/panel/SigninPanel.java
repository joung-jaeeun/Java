package a24_À©µµ¿ìºô´õ.swing.frame.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import a24_À©µµ¿ìºô´õ.service.AuthService;
import a24_À©µµ¿ìºô´õ.swing.dto.SigninDto;

import javax.swing.JTabbedPane;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SigninPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JTextField usernameText;
	private JPasswordField passwordText;
	private AuthService authService;

	
	public SigninPanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(1000,600);
		
		authService = new AuthService();
		
		
		JLabel signinTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		signinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signinTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		signinTitle.setBounds(386, 134, 236, 67);
		add(signinTitle);
		
		JPanel signinItems = new JPanel();
		signinItems.setBackground(Color.WHITE);
		signinItems.setBounds(253, 185, 544, 368);
		add(signinItems);
		signinItems.setLayout(null);
		
		JLabel usernameLabel = new JLabel("\uC544\uC774\uB514");
		usernameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		usernameLabel.setBounds(37, 105, 57, 15);
		signinItems.add(usernameLabel);
		
		usernameText = new JTextField();
		usernameText.setBounds(96, 98, 268, 35);
		signinItems.add(usernameText);
		usernameText.setColumns(10);
		
		JLabel passwordLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLable.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		passwordLable.setBounds(25, 184, 94, 22);
		signinItems.add(passwordLable);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		passwordText.setBounds(96, 180, 268, 35);
		signinItems.add(passwordText);
		
		JButton signinButton = new JButton("\uB85C\uADF8\uC778");
		signinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SigninDto signinDto = new SigninDto();
				signinDto.setUsername(usernameText.getText());
				signinDto.setPassword(passwordText.getText());
				int result = authService.signin(signinDto);
				if(result == 2) {
					//·Î±×ÀÎ ¼º°ø
					mainCard.show(mainPanel,"indexPanel");
					
				}else if(result == 0 ) {
					System.out.println("Á¸ÀçÇÏÁö ¾Ê´Â ¾ÆÀÌµð");
				}else if(result == 1 ) {
					System.out.println("ºñ¹Ð¹øÈ£°¡ ÀÏÄ¡ ÇÏÁö ¾ÊÀ½");
				}
			}
		});
		signinButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		signinButton.setBounds(177, 254, 97, 35);
		signinItems.add(signinButton);
	}
}
