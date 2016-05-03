#!/bin/sh
if [ "$#" -ne 3 ]; then
  echo "Usage: pushGeneric.sh TOKEN DPID FLOW" >&2
  exit 1
fi
curl -sk -H "X-Auth-Token:$1" -X POST -H 'Content-Type:application/json' "https://van88.netlab.uky.edu:8443/sdn/v2.0/of/datapaths/$2/flows" -d @$3
