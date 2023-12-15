import re
def validate_email(email);
pattern=r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'
if re.match(pattern, email):
print("Valid Email ID")
else:
    print("Invalid Email Id")
    email_input = ("Enter an email address: ")
    validate_email(email_input)