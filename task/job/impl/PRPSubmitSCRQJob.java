/**
 * 
 */
package com.sinosoft.ummp.task.job.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.sinosoft.ummp.task.SuperJob;
import com.sinosoft.ummp.task.job.SubmitJob;
import com.sinosoft.ummp.util.UMMPContext;

/**
 * 保单登记报送批处理:SummaryCheckResultQuery
 * @author Darker.Wang
 * @date 2016-8-18 下午2:06:05
 * @company SINOSOFT
 */
@Service
public class PRPSubmitSCRQJob extends SuperJob implements SubmitJob {
	
	public PRPSubmitSCRQJob(){
		//设置为报送群组
		this.setJobGroup("JOB_SUBMIT");
	}
	/* (non-Javadoc)
	 * @see com.sinosoft.ummp.task.SuperJob#excute()
	 */
	@Override
	public boolean excute() throws Exception {
		// TODO 汇总对账查询不分日期
		return submit(null,null);
	}
	/* (non-Javadoc)
	 * @see com.sinosoft.ummp.task.job.SubmitJob#submit(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean submit(String startDate, String endDate) throws Exception {
		//获取平台
		System.out.println("================= 保单登记数据报送,汇总对账查询批处理开始 =================");
		try{
			String bussType = "SummaryCheckResultQuery";
			String bussNo = "";
			return submit(new BigDecimal(UMMPContext.SUBMIT_PLAT_PRP), bussType, startDate, endDate, bussNo);
		}catch(Exception e){
			throw e;
		}finally{
			System.out.println("================= 保单登记数据报送，汇总对账查询批处理结束 =================");	
		}
	}
}
