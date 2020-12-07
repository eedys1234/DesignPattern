package Observer;

public class Button {
	
	OnClickListener onClickListener;
	
	public Button() {
		
	}
	
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick() {
		onClickListener.onClick(this);
	}

	public interface OnClickListener {		
		public void onClick(Button button);
	}
}


