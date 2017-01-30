package com.example.myclient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.myclient.R;

public class Change extends Activity{
	
	private static final String ipAdress="192.168.1.103";
	
    private TextView lblPort;
    private TextView lblPd;
    private TextView lblMd;
    private TextView lblprotocol;
    private TextView lblprotocol_param;
    private TextView lblobfs;
    private TextView lblobfs_param;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change);
        
        lblPort=(TextView)this.findViewById(R.id.lblPort);
        lblPd=(TextView)this.findViewById(R.id.lblPd);
        lblMd=(TextView)this.findViewById(R.id.lblMd);
        lblprotocol=(TextView)this.findViewById(R.id.lblprotocol);
        lblprotocol_param=(TextView)this.findViewById(R.id.lblprotocol_param);
        lblobfs=(TextView)this.findViewById(R.id.lblobfs);
        lblobfs_param=(TextView)this.findViewById(R.id.lblobfs_param);
        
        UserVO o=new UserVO();
        
		lblPort.setText(o.getPort());
		lblPd.setText(o.getPwd());
		lblMd.setText(o.getMd());
		lblprotocol.setText(o.getProtocol());
		lblobfs.setText(o.getobfs());
		lblprotocol_param.setText(o.getprotocol_param());
		lblobfs_param.setText(o.getobfs_param());
    }
}
