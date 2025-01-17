package Team9.Scala;

enum TokenType {
	// Single-character tokens.
	  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
	  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,
	  // One or two character tokens.
	  BANG, BANG_EQUAL,
	  EQUAL, EQUAL_EQUAL,
	  GREATER, GREATER_EQUAL,
	  LESS, LESS_EQUAL,
	  LESS_HYPHEN, OR, AND,

	  // Literals.
	  IDENTIFIER, STRING, NUMBER, TO,

	  // Keywords.
	  OBJECT, DEFINATION, PRINTLINE, VAR, IF, ELSE, FOR, WHILE, RETURN,TRUE, FALSE, NULL,
	  
	  
	  EOF
}
