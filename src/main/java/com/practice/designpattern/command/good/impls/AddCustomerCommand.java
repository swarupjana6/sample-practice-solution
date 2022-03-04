package com.practice.designpattern.command.good.impls;

import com.practice.designpattern.command.good.CustomerService;
import com.practice.designpattern.command.good.framework.Command;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddCustomerCommand implements Command {

    @NonNull
    private CustomerService customerService;

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
