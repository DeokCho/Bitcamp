package member2;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sun.print.resources.serviceui;

public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container container;
	private JLabel title, nameLabel, useridLabel, passwordLabel, ssnLabel, addrLabel;
	private JTextField nameText, useridText, passwordText, ssnText, addrText;
	private JTextArea resultText;
	private JButton submitButton, listButton, loginButton, nameButton, countButton, detailButton, genderButton,
			updateButton, deleteButton;
	public MemberService memberService;

	public void open() {
		memberService = new MemberServiceImpl();

		setTitle("Swing Exercise");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		title = new JLabel("Swing Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		nameLabel.setSize(100, 20);
		nameLabel.setLocation(100, 100);
		container.add(nameLabel);

		nameText = new JTextField();
		nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		nameText.setSize(190, 20);
		nameText.setLocation(200, 100);
		container.add(nameText);

		useridLabel = new JLabel("Userid");
		useridLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		useridLabel.setSize(100, 20);
		useridLabel.setLocation(100, 150);
		container.add(useridLabel);

		useridText = new JTextField();
		useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		useridText.setSize(150, 20);
		useridText.setLocation(200, 150);
		container.add(useridText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordLabel.setSize(100, 20);
		passwordLabel.setLocation(100, 200);
		container.add(passwordLabel);

		passwordText = new JTextField();
		passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		passwordText.setSize(150, 20);
		passwordText.setLocation(200, 200);
		container.add(passwordText);

		ssnLabel = new JLabel("SSN");
		ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ssnLabel.setSize(100, 20);
		ssnLabel.setLocation(100, 250);
		container.add(ssnLabel);

		ssnText = new JTextField();
		ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		ssnText.setSize(150, 20);
		ssnText.setLocation(200, 250);
		container.add(ssnText);

		addrLabel = new JLabel("Address");
		addrLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addrLabel.setSize(100, 20);
		addrLabel.setLocation(100, 300);
		container.add(addrLabel);

		addrText = new JTextField();
		addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		addrText.setSize(150, 20);
		addrText.setLocation(200, 300);
		container.add(addrText);

		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
		submitButton.setSize(100, 20);
		submitButton.setLocation(120, 450);
		container.add(submitButton);
		submitButton.addActionListener(this);

		listButton = new JButton("List");
		listButton.setFont(new Font("Arial", Font.PLAIN, 15));
		listButton.setSize(100, 20);
		listButton.setLocation(240, 450);
		container.add(listButton);
		listButton.addActionListener(this);

		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(360, 450);
		container.add(loginButton);
		loginButton.addActionListener(this);

		detailButton = new JButton("Detail");
		detailButton.setFont(new Font("Arial", Font.PLAIN, 15));
		detailButton.setSize(100, 20);
		detailButton.setLocation(120, 480);
		container.add(detailButton);
		detailButton.addActionListener(this);

		nameButton = new JButton("name");
		nameButton.setFont(new Font("Arial", Font.PLAIN, 15));
		nameButton.setSize(100, 20);
		nameButton.setLocation(240, 480);
		container.add(nameButton);
		nameButton.addActionListener(this);

		genderButton = new JButton("gender");
		genderButton.setFont(new Font("Arial", Font.PLAIN, 15));
		genderButton.setSize(100, 20);
		genderButton.setLocation(360, 480);
		container.add(genderButton);
		genderButton.addActionListener(this);

		countButton = new JButton("count");
		countButton.setFont(new Font("Arial", Font.PLAIN, 15));
		countButton.setSize(100, 20);
		countButton.setLocation(120, 510);
		container.add(countButton);
		countButton.addActionListener(this);

		updateButton = new JButton("Update");
		updateButton.setFont(new Font("Arial", Font.PLAIN, 15));
		updateButton.setSize(100, 20);
		updateButton.setLocation(240, 510);
		container.add(updateButton);
		updateButton.addActionListener(this);

		deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 15));
		deleteButton.setSize(100, 20);
		deleteButton.setLocation(360, 510);
		container.add(deleteButton);
		deleteButton.addActionListener(this);

		resultText = new JTextArea();
		resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		resultText.setSize(300, 400);
		resultText.setLocation(500, 100);
		resultText.setLineWrap(true);
		resultText.setEditable(false);
		container.add(resultText);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitButton) {
			nameText.setText("일,이,삼,사,오");
			useridText.setText("a,b,c,d,e");
			passwordText.setText("1,2,3,4,5");
			ssnText.setText("에이, 비, 시, 디, 이!");
			addrText.setText("하나,둘,셋,넷,다섯");

			String[] names = nameText.getText().split(",");
			String[] userIds = useridText.getText().split(",");
			String[] passwords = passwordText.getText().split(",");
			String[] ssns = ssnText.getText().split(",");
			String[] addrs = addrText.getText().split(",");

			Member member = null;
			for (int i = 0; i < names.length; i++) {
				member = new Member();
				member.setName(names[i]);
				member.setUserId(userIds[i]);
				member.setPassword(passwords[i]);
				member.setSsn(ssns[i]);
				member.setAddress(addrs[i]);
				memberService.add(member);
			}
		} else if (e.getSource() == listButton) {
			Member[] members = memberService.list();
			String result = "";
			for (int i = 0; i < members.length; i++) {
				result += members[i];
			}
			JOptionPane.showMessageDialog(this, "로그인 성공");
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(result);

		} else if (e.getSource() == loginButton) {
			Member member = new Member();
			member.setUserId(useridText.getText());
			member.setPassword(passwordText.getText());
			Member login = memberService.login(member);
			if (login != null) {
				resultText.setText(login.toString());
			} else {
				resultText.setText("로그인 실패");
			}
		} else if (e.getSource() == detailButton) {
			Member member = new Member();
			member.setUserId(useridText.getText());
			Member detail = memberService.detail(member.getUserId());
			if (detail != null) {
				resultText.setText(detail.toString());
			} else {
				resultText.setText("일치하는 정보 없음");
			}

//		}else if(e.getSource() == nameButton) {
//			Member member = new Member();
//			member.setName(nameText.getName());
//			Member Names = 
//		}
	}
}}
