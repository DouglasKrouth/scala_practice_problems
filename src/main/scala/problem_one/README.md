# Problem One
## Background
The application receives pricing and rate information from a third party data
provider. We make two calls to this provider to receive a list of rates and a list of cabin prices. We can use
this data to solve several problems for our customers. The problem we’ll be focusing on for this exercise
will be **finding the best price for a particular rate group**.

## Terms
**Cabin Price**: The price for a specific cabin on a specific cruise. All cabin prices will have a single rate
attached.

**Rate**: A rate is a way to group related prices together. A rate is defined by its Rate Code and which Rate
Group it belongs to. 
* For example. *(MilAB, Military)* and *(Sen123, Senior)*

**Rate Group**: Specific rates are grouped into a related rate group. There is a one-to-many relationship
between rate groups and rates (A rate group is made up of many rates, but a rate can only belong to a
single rate group) 
* Some examples of rate groups are: *Standard*, *Military*, *Senior*, and *Promotion*.